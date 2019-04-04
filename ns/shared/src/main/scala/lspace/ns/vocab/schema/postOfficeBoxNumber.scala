package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object postOfficeBoxNumber extends PropertyDef(
        iri = "https://schema.org/postOfficeBoxNumber",
        iris = Set("https://schema.org/postOfficeBoxNumber"),
        label = "postOfficeBoxNumber",
        comment = """The post office box number for PO box addresses.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}