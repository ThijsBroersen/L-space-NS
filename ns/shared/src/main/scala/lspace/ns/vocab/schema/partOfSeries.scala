package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object partOfSeries extends PropertyDef(
        iri = "http://schema.org/partOfSeries",
        iris = Set("http://schema.org/partOfSeries"),
        label = "partOfSeries",
        comment = """The series to which this episode or season belongs.""",
        `@extends` = () => List(isPartOf.property),
        `@range` = () => List(CreativeWorkSeries.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.isPartOf.Properties
}