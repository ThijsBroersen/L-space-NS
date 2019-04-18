package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Occupation
    extends OntologyDef(
      iri = "http://schema.org/Occupation",
      iris = Set("http://schema.org/Occupation"),
      label = "Occupation",
      comment = """A profession, may involve prolonged training and/or a formal qualification.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val estimatedSalary = lspace.ns.vocab.schema.estimatedSalary.property
  }
  override lazy val properties: List[Property] = List(estimatedSalary)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val estimatedSalary = lspace.ns.vocab.schema.estimatedSalary.property
  }
}
