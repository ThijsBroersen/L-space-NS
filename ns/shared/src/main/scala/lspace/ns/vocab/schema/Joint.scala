package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Joint extends OntologyDef(
        iri = "http://schema.org/Joint",
        iris = Set("http://schema.org/Joint"),
        label = "Joint",
        comment = """The anatomical location at which two or more bones make contact.""",
        `@extends` = () => List(AnatomicalStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AnatomicalStructure.Properties{
lazy val biomechnicalClass = lspace.ns.vocab.schema.biomechnicalClass.property
lazy val functionalClass = lspace.ns.vocab.schema.functionalClass.property
lazy val structuralClass = lspace.ns.vocab.schema.structuralClass.property
}
override lazy val properties: List[LProperty] = List(biomechnicalClass, functionalClass, structuralClass)
trait Properties extends lspace.ns.vocab.schema.AnatomicalStructure.Properties{
lazy val biomechnicalClass = lspace.ns.vocab.schema.biomechnicalClass.property
lazy val functionalClass = lspace.ns.vocab.schema.functionalClass.property
lazy val structuralClass = lspace.ns.vocab.schema.structuralClass.property
}
}