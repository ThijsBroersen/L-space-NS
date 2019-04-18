package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object branch
    extends PropertyDef(
      iri = "http://schema.org/branch",
      iris = Set("http://schema.org/branch"),
      label = "branch",
      comment =
        """The branches that delineate from the nerve bundle. Not to be confused with <a class="localLink" href="http://schema.org/branchOf">branchOf</a>.""",
      `@extends` = () => List(),
      `@range` = () => List(AnatomicalStructure.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
