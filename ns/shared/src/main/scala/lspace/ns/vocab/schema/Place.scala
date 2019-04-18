package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Place
    extends OntologyDef(
      iri = "http://schema.org/Place",
      iris = Set("http://schema.org/Place"),
      label = "Place",
      comment = """Entities that have a somewhat fixed, physical extension.""",
      `@extends` = () => List(Thing.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val maps                             = lspace.ns.vocab.schema.maps.property
    lazy val geo                              = lspace.ns.vocab.schema.geo.property
    lazy val containedInPlace                 = lspace.ns.vocab.schema.containedInPlace.property
    lazy val geoTouches                       = lspace.ns.vocab.schema.geoTouches.property
    lazy val hasMap                           = lspace.ns.vocab.schema.hasMap.property
    lazy val geoCovers                        = lspace.ns.vocab.schema.geoCovers.property
    lazy val map                              = lspace.ns.vocab.schema.map.property
    lazy val events                           = lspace.ns.vocab.schema.events.property
    lazy val geoDisjoint                      = lspace.ns.vocab.schema.geoDisjoint.property
    lazy val geoCoveredBy                     = lspace.ns.vocab.schema.geoCoveredBy.property
    lazy val additionalProperty               = lspace.ns.vocab.schema.additionalProperty.property
    lazy val containedIn                      = lspace.ns.vocab.schema.containedIn.property
    lazy val publicAccess                     = lspace.ns.vocab.schema.publicAccess.property
    lazy val slogan                           = lspace.ns.vocab.schema.slogan.property
    lazy val containsPlace                    = lspace.ns.vocab.schema.containsPlace.property
    lazy val photos                           = lspace.ns.vocab.schema.photos.property
    lazy val event                            = lspace.ns.vocab.schema.event.property
    lazy val logo                             = lspace.ns.vocab.schema.logo.property
    lazy val telephone                        = lspace.ns.vocab.schema.telephone.property
    lazy val isicV4                           = lspace.ns.vocab.schema.isicV4.property
    lazy val amenityFeature                   = lspace.ns.vocab.schema.amenityFeature.property
    lazy val geoEquals                        = lspace.ns.vocab.schema.geoEquals.property
    lazy val branchCode                       = lspace.ns.vocab.schema.branchCode.property
    lazy val review                           = lspace.ns.vocab.schema.review.property
    lazy val isAccessibleForFree              = lspace.ns.vocab.schema.isAccessibleForFree.property
    lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification.property
    lazy val geoIntersects                    = lspace.ns.vocab.schema.geoIntersects.property
  }
  override lazy val properties: List[Property] = List(
    maps,
    geo,
    containedInPlace,
    geoTouches,
    hasMap,
    geoCovers,
    map,
    events,
    geoDisjoint,
    geoCoveredBy,
    additionalProperty,
    containedIn,
    publicAccess,
    slogan,
    containsPlace,
    photos,
    event,
    logo,
    telephone,
    isicV4,
    amenityFeature,
    geoEquals,
    branchCode,
    review,
    isAccessibleForFree,
    specialOpeningHoursSpecification,
    geoIntersects
  )
  trait Properties extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val maps                             = lspace.ns.vocab.schema.maps.property
    lazy val geo                              = lspace.ns.vocab.schema.geo.property
    lazy val containedInPlace                 = lspace.ns.vocab.schema.containedInPlace.property
    lazy val geoTouches                       = lspace.ns.vocab.schema.geoTouches.property
    lazy val hasMap                           = lspace.ns.vocab.schema.hasMap.property
    lazy val geoCovers                        = lspace.ns.vocab.schema.geoCovers.property
    lazy val map                              = lspace.ns.vocab.schema.map.property
    lazy val events                           = lspace.ns.vocab.schema.events.property
    lazy val geoDisjoint                      = lspace.ns.vocab.schema.geoDisjoint.property
    lazy val geoCoveredBy                     = lspace.ns.vocab.schema.geoCoveredBy.property
    lazy val additionalProperty               = lspace.ns.vocab.schema.additionalProperty.property
    lazy val containedIn                      = lspace.ns.vocab.schema.containedIn.property
    lazy val publicAccess                     = lspace.ns.vocab.schema.publicAccess.property
    lazy val slogan                           = lspace.ns.vocab.schema.slogan.property
    lazy val containsPlace                    = lspace.ns.vocab.schema.containsPlace.property
    lazy val photos                           = lspace.ns.vocab.schema.photos.property
    lazy val event                            = lspace.ns.vocab.schema.event.property
    lazy val logo                             = lspace.ns.vocab.schema.logo.property
    lazy val telephone                        = lspace.ns.vocab.schema.telephone.property
    lazy val isicV4                           = lspace.ns.vocab.schema.isicV4.property
    lazy val amenityFeature                   = lspace.ns.vocab.schema.amenityFeature.property
    lazy val geoEquals                        = lspace.ns.vocab.schema.geoEquals.property
    lazy val branchCode                       = lspace.ns.vocab.schema.branchCode.property
    lazy val review                           = lspace.ns.vocab.schema.review.property
    lazy val isAccessibleForFree              = lspace.ns.vocab.schema.isAccessibleForFree.property
    lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification.property
    lazy val geoIntersects                    = lspace.ns.vocab.schema.geoIntersects.property
  }
}
