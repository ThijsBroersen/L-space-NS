package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object citation extends PropertyDef(
        iri = "http://schema.org/citation",
        iris = Set("http://schema.org/citation"),
        label = "citation",
        comment = """A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.""",
        `@extends` = List(),
        `@range` = List(`@string`, CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}