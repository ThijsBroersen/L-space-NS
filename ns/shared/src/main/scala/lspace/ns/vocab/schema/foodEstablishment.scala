package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object foodEstablishment extends PropertyDef(
        iri = "http://schema.org/foodEstablishment",
        iris = Set("http://schema.org/foodEstablishment"),
        label = "foodEstablishment",
        comment = """A sub property of location. The specific food establishment where the action occurred.""",
        `@extends` = List(location.property),
        `@range` = List(FoodEstablishment.ontology, Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.location.Properties
}