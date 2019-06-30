package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object variableMeasured extends PropertyDef(
        iri = "http://schema.org/variableMeasured",
        iris = Set("http://schema.org/variableMeasured"),
        label = "variableMeasured",
        comment = """The variableMeasured property can indicate (repeated as necessary) the  variables that are measured in some dataset, either described as text or as pairs of identifier and description using PropertyValue.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, PropertyValue.ontology)
       ){
}