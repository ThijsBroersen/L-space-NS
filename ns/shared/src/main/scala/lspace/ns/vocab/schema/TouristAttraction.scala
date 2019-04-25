package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TouristAttraction
    extends OntologyDef(
      iri = "http://schema.org/TouristAttraction",
      iris = Set("http://schema.org/TouristAttraction"),
      label = "TouristAttraction",
      comment =
        """A tourist attraction.  In principle any Thing can be a <a class="localLink" href="http://schema.org/TouristAttraction">TouristAttraction</a>, from a <a class="localLink" href="http://schema.org/Mountain">Mountain</a> and <a class="localLink" href="http://schema.org/LandmarksOrHistoricalBuildings">LandmarksOrHistoricalBuildings</a> to a <a class="localLink" href="http://schema.org/LocalBusiness">LocalBusiness</a>.  This Type can be used on its own to describe a general <a class="localLink" href="http://schema.org/TouristAttraction">TouristAttraction</a>, or be used as an <a class="localLink" href="http://schema.org/additionalType">additionalType</a> to add tourist attraction properties to any other type.  (See examples below)""",
      `@extends` = () => List(Place.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Place.Properties {
    lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage.property
    lazy val touristType       = lspace.ns.vocab.schema.touristType.property
  }
  override lazy val properties: List[LProperty] = List(availableLanguage, touristType)
  trait Properties extends lspace.ns.vocab.schema.Place.Properties {
    lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage.property
    lazy val touristType       = lspace.ns.vocab.schema.touristType.property
  }
}
