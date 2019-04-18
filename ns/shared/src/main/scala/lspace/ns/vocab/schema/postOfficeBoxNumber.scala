package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object postOfficeBoxNumber extends PropertyDef(
        iri = "http://schema.org/postOfficeBoxNumber",
        iris = Set("http://schema.org/postOfficeBoxNumber"),
        label = "postOfficeBoxNumber",
        comment = """The post office box number for PO box addresses.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}