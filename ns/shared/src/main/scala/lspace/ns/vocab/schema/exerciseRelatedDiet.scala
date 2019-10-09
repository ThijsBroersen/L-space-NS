package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object exerciseRelatedDiet extends PropertyDef(
        iri = "http://schema.org/exerciseRelatedDiet",
        iris = Set("http://schema.org/exerciseRelatedDiet"),
        label = "exerciseRelatedDiet",
        comment = """A sub property of instrument. The diet used in this action.""",
        `@extends` = List(instrument.property),
        `@range` = List(Diet.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}