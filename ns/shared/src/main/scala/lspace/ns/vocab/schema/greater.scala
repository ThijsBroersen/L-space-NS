package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object greater extends PropertyDef(
        iri = "http://schema.org/greater",
        iris = Set("http://schema.org/greater"),
        label = "greater",
        comment = """This ordering relation for qualitative values indicates that the subject is greater than the object.""",
        `@extends` = List(),
        `@range` = List(QualitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}