package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object equal extends PropertyDef(
        iri = "http://schema.org/equal",
        iris = Set("http://schema.org/equal"),
        label = "equal",
        comment = """This ordering relation for qualitative values indicates that the subject is equal to the object.""",
        `@extends` = () => List(),
        `@range` = () => List(QualitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}