package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object byMonth
    extends PropertyDef(
      iri = "http://schema.org/byMonth",
      iris = Set("http://schema.org/byMonth"),
      label = "byMonth",
      comment =
        """Defines the month(s) of the year on which a recurring <a class="localLink" href="http://schema.org/Event">Event</a> takes place. Specified as an <a class="localLink" href="http://schema.org/Integer">Integer</a> between 1-12. January is 1.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
