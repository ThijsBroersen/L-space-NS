package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object requiresSubscription
    extends PropertyDef(
      iri = "http://schema.org/requiresSubscription",
      iris = Set("http://schema.org/requiresSubscription"),
      label = "requiresSubscription",
      comment =
        """Indicates if use of the media require a subscription  (either paid or free). Allowed values are <code>true</code> or <code>false</code> (note that an earlier version had 'yes', 'no').""",
      `@extends` = () => List(),
      `@range` = () => List(MediaSubscription.ontology, `@boolean`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
