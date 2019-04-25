package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object softwareHelp
    extends PropertyDef(
      iri = "http://schema.org/softwareHelp",
      iris = Set("http://schema.org/softwareHelp"),
      label = "softwareHelp",
      comment = """Software application help.""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
