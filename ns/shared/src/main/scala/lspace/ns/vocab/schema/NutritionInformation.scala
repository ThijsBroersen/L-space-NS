package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NutritionInformation extends OntologyDef(
        iri = "http://schema.org/NutritionInformation",
        iris = Set("http://schema.org/NutritionInformation"),
        label = "NutritionInformation",
        comment = """Nutritional information about the recipe.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}