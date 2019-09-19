package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object lesserOrEqual extends PropertyDef(
        iri = "http://schema.org/lesserOrEqual",
        iris = Set("http://schema.org/lesserOrEqual"),
        label = "lesserOrEqual",
        comment = """This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.""",
        `@extends` = () => List(),
        `@range` = () => List(QualitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}