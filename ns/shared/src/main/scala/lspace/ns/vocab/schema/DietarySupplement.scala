package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DietarySupplement extends OntologyDef(
        iri = "http://schema.org/DietarySupplement",
        iris = Set("http://schema.org/DietarySupplement"),
        label = "DietarySupplement",
        comment = """A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.""",
        `@extends` = () => List(Substance.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Substance.Properties{
lazy val nonProprietaryName = lspace.ns.vocab.schema.nonProprietaryName.property
}
override lazy val properties: List[LProperty] = List(nonProprietaryName)
trait Properties extends lspace.ns.vocab.schema.Substance.Properties{
lazy val nonProprietaryName = lspace.ns.vocab.schema.nonProprietaryName.property
}
}