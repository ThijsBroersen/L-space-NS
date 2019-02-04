package lspace.ns

import lspace.NS
import lspace.NS.vocab.{schema, Lspace}
import lspace.librarian.datatype.DataType
import lspace.librarian.structure._

object File extends OntologyDef(Lspace + "File", label = "File", comment = "A File ..") {

  object keys {
    object `lspace:name`
        extends PropertyDef(NS.vocab.Lspace + "name",
                            "name",
                            "The name of the file",
                            `@range` = () => DataType.default.`@string` :: Nil)
    lazy val `schema:name@String`: TypedProperty[String] = `lspace:name` as DataType.default.`@string`

    /**
      * file extensions should be modelled as class/ontology?
      * e.g. PDF https://.../filesystem/file/PDF
      */
    object `lspace:File/ext` extends PropertyDef(Lspace + "File/ext", "ext", "The extension of the file.")
    object `schema:downloadUrl`
        extends PropertyDef(schema + "downloadUrl", "downloadUrl", "The url at which the file can be retrieved.")
    object `schema:fileSize`     extends PropertyDef(schema + "fileSize", "fileSize")
    object `schema:author`       extends PropertyDef(schema + "author", "author")
    object `lspace:owner`        extends PropertyDef(schema + "owner", "owner")
    object `schema:dateModified` extends PropertyDef(schema + "dateModified", "dateModified")
    object `schema:dateCreated`
        extends PropertyDef(Lspace + "filesystem/File/dateCreated",
                            "dateCreated",
                            "The date on which the file was created.",
                            `@extends` = () => Property(schema + "dateCreated") :: Nil)
    object `lspace:File/lastAccessedOn`
        extends PropertyDef(Lspace + "File/lastAccessedOn",
                            "lastAccessedOn",
                            "The moment at which the file was last accessed.")
  }
  override lazy val properties
    : List[Property] = keys.`lspace:name`.property :: keys.`lspace:File/ext`.property :: keys.`schema:downloadUrl`.property ::
    keys.`schema:fileSize`.property :: keys.`schema:author`.property ::
    keys.`schema:dateModified`.property :: keys.`schema:dateCreated`.property :: keys.`lspace:File/lastAccessedOn`.property :: Nil

  trait Properties {
    lazy val `lspace:name`: Property                = keys.`lspace:name`
    lazy val `lspace:File/ext`: Property            = keys.`lspace:File/ext`
    lazy val `schema:downloadUrl`: Property         = keys.`schema:downloadUrl`
    lazy val `schema:fileSize`: Property            = keys.`schema:fileSize`
    lazy val `schema:author`: Property              = keys.`schema:author`
    lazy val `schema:dateModified`: Property        = keys.`schema:dateModified`
    lazy val `schema:dateCreated`: Property         = keys.`schema:dateCreated`
    lazy val `lspace:File/lastAccessedOn`: Property = keys.`lspace:File/lastAccessedOn`
  }
}
