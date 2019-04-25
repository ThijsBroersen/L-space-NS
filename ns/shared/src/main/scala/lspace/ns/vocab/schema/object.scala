package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object `object`
    extends PropertyDef(
      iri = "http://schema.org/object",
      iris = Set("http://schema.org/object"),
      label = "object",
      comment =
        """The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read <em>a book</em>.""",
      `@extends` = () => List(),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
