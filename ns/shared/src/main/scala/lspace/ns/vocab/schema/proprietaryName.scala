package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object proprietaryName
    extends PropertyDef(
      iri = "http://schema.org/proprietaryName",
      iris = Set("http://schema.org/proprietaryName"),
      label = "proprietaryName",
      comment = """Proprietary name given to the diet plan, typically by its originator or creator.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
