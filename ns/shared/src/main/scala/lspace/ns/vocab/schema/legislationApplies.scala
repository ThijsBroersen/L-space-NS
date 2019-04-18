package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object legislationApplies
    extends PropertyDef(
      iri = "http://schema.org/legislationApplies",
      iris = Set("http://schema.org/legislationApplies"),
      label = "legislationApplies",
      comment =
        """Indicates that this legislation (or part of a legislation) somehow transfers another legislation in a different legislative context. This is an informative link, and it has no legal value. For legally-binding links of transposition, use the <a href="/legislationTransposes">legislationTransposes</a> property. For example an informative consolidated law of a European Union's member state "applies" the consolidated version of the European Directive implemented in it.""",
      `@extends` = () => List(),
      `@range` = () => List(Legislation.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
