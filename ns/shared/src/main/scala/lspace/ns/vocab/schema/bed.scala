package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bed extends PropertyDef(
        iri = "http://schema.org/bed",
        iris = Set("http://schema.org/bed"),
        label = "bed",
        comment = """The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
      If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, BedDetails.ontology, BedType.ontology)
       ){
}