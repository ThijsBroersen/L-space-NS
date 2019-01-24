package lspace.ns

import lspace.librarian.structure.{OntologyDef, Property, PropertyDef}
import lspace.NS.vocab._

object Directory
    extends OntologyDef(Lspace + "Directory", label = "Directory", `@extends` = () => File.ontology :: Nil) {

  object keys extends File.Properties {
    object `lspace:Directory/contains`
        extends PropertyDef(Lspace + "Directory/contains", "contains", container = List("@set"))
    lazy val `lspace:Directory/contains@File`      = `lspace:Directory/contains` as File.ontology
    lazy val `lspace:Directory/contains@Directory` = `lspace:Directory/contains` as Directory.ontology
  }
  override lazy val properties: List[Property] = keys.`lspace:Directory/contains` :: File.properties

  trait Properties extends File.Properties {
    lazy val contains: Property                    = keys.`lspace:Directory/contains`
    lazy val `lspace:Directory/contains@File`      = keys.`lspace:Directory/contains@File`
    lazy val `lspace:Directory/contains@Directory` = keys.`lspace:Directory/contains@Directory`
  }
}
