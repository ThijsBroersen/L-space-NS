package lspace.ns

import lspace.librarian.structure.{OntologyDef, Property, PropertyDef}
import lspace.NS.vocab._

object Directory extends OntologyDef(Lspace + "Directory", label = "Directory") {

  object keys {
    object `lspace:Directory/contains`
        extends PropertyDef(Lspace + "Directory/contains", "contains", container = List("@set"))
    lazy val `lspace:Directory/contains@File`      = `lspace:Directory/contains` as File.ontology
    lazy val `lspace:Directory/contains@Directory` = `lspace:Directory/contains` as Directory.ontology

    lazy val `lspace:name`         = File.keys.`lspace:name`
    lazy val `lspace:File/ext`     = File.keys.`lspace:File/ext`
    lazy val `schema:downloadUrl`  = File.keys.`schema:downloadUrl`
    lazy val `schema:fileSize`     = File.keys.`schema:fileSize`
    lazy val `schema:author`       = File.keys.`schema:author`
    lazy val `lspace:owner`        = File.keys.`lspace:owner`
    lazy val `schema:dateModified` = File.keys.`schema:dateModified`
    object `schema:dateCreated`
        extends PropertyDef(
          Lspace + "filesystem/Directory/dateCreated",
          "dateCreated",
          "The date on which the directory was created.",
          `@extends` = () => Property(schema + "dateCreated") :: Nil
        )
    object `lspace:Directory/lastAccessedOn`
        extends PropertyDef(Lspace + "Directory/lastAccessedOn",
                            "lastAccessedOn",
                            "The moment at which the directory was last accessed.")
  }
  override lazy val properties
    : List[Property] = keys.`lspace:Directory/contains`.property :: keys.`lspace:name`.property :: keys.`lspace:File/ext`.property ::
    keys.`schema:downloadUrl`.property :: keys.`schema:fileSize`.property :: keys.`schema:author`.property ::
    keys.`schema:dateModified`.property :: keys.`schema:dateCreated`.property :: keys.`lspace:Directory/lastAccessedOn`.property :: Nil

  trait Properties {
    lazy val contains: Property                    = keys.`lspace:Directory/contains`
    lazy val `lspace:Directory/contains@File`      = keys.`lspace:Directory/contains@File`
    lazy val `lspace:Directory/contains@Directory` = keys.`lspace:Directory/contains@Directory`

    lazy val `lspace:name`: Property                = Directory.keys.`lspace:name`
    lazy val `lspace:File/ext`: Property            = Directory.keys.`lspace:File/ext`
    lazy val `schema:downloadUrl`: Property         = Directory.keys.`schema:downloadUrl`
    lazy val `schema:fileSize`: Property            = Directory.keys.`schema:fileSize`
    lazy val `schema:author`: Property              = Directory.keys.`schema:author`
    lazy val `schema:dateModified`: Property        = Directory.keys.`schema:dateModified`
    lazy val `schema:dateCreated`: Property         = Directory.keys.`schema:dateCreated`
    lazy val `lspace:File/lastAccessedOn`: Property = Directory.keys.`lspace:Directory/lastAccessedOn`
  }
}
