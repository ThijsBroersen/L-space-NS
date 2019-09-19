package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object musicCompositionForm extends PropertyDef(
        iri = "http://schema.org/musicCompositionForm",
        iris = Set("http://schema.org/musicCompositionForm"),
        label = "musicCompositionForm",
        comment = """The type of composition (e.g. overture, sonata, symphony, etc.).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}