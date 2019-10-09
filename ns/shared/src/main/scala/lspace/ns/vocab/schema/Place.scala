package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Place extends OntologyDef(
        iri = "http://schema.org/Place",
        iris = Set("http://schema.org/Place"),
        label = "Place",
        comment = """Entities that have a somewhat fixed, physical extension.""",
        `@extends` = List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val address = lspace.ns.vocab.schema.address.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property
lazy val branchCode = lspace.ns.vocab.schema.branchCode.property
lazy val containedInPlace = lspace.ns.vocab.schema.containedInPlace.property
lazy val containsPlace = lspace.ns.vocab.schema.containsPlace.property
lazy val event = lspace.ns.vocab.schema.event.property
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
lazy val geo = lspace.ns.vocab.schema.geo.property
lazy val geoContains = lspace.ns.vocab.schema.geoContains.property
lazy val geoCoveredBy = lspace.ns.vocab.schema.geoCoveredBy.property
lazy val geoCovers = lspace.ns.vocab.schema.geoCovers.property
lazy val geoCrosses = lspace.ns.vocab.schema.geoCrosses.property
lazy val geoDisjoint = lspace.ns.vocab.schema.geoDisjoint.property
lazy val geoEquals = lspace.ns.vocab.schema.geoEquals.property
lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects.property
lazy val geoOverlaps = lspace.ns.vocab.schema.geoOverlaps.property
lazy val geoTouches = lspace.ns.vocab.schema.geoTouches.property
lazy val geoWithin = lspace.ns.vocab.schema.geoWithin.property
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
lazy val hasMap = lspace.ns.vocab.schema.hasMap.property
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property
lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity.property
lazy val openingHoursSpecification = lspace.ns.vocab.schema.openingHoursSpecification.property
lazy val photo = lspace.ns.vocab.schema.photo.property
lazy val publicAccess = lspace.ns.vocab.schema.publicAccess.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val smokingAllowed = lspace.ns.vocab.schema.smokingAllowed.property
lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification.property
lazy val telephone = lspace.ns.vocab.schema.telephone.property
}
override lazy val properties: List[LProperty] = List(additionalProperty, address, aggregateRating, amenityFeature, branchCode, containedInPlace, containsPlace, event, faxNumber, geo, geoContains, geoCoveredBy, geoCovers, geoCrosses, geoDisjoint, geoEquals, geoIntersects, geoOverlaps, geoTouches, geoWithin, globalLocationNumber, hasMap, isAccessibleForFree, isicV4, logo, maximumAttendeeCapacity, openingHoursSpecification, photo, publicAccess, review, slogan, smokingAllowed, specialOpeningHoursSpecification, telephone)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val address = lspace.ns.vocab.schema.address.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property
lazy val branchCode = lspace.ns.vocab.schema.branchCode.property
lazy val containedInPlace = lspace.ns.vocab.schema.containedInPlace.property
lazy val containsPlace = lspace.ns.vocab.schema.containsPlace.property
lazy val event = lspace.ns.vocab.schema.event.property
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
lazy val geo = lspace.ns.vocab.schema.geo.property
lazy val geoContains = lspace.ns.vocab.schema.geoContains.property
lazy val geoCoveredBy = lspace.ns.vocab.schema.geoCoveredBy.property
lazy val geoCovers = lspace.ns.vocab.schema.geoCovers.property
lazy val geoCrosses = lspace.ns.vocab.schema.geoCrosses.property
lazy val geoDisjoint = lspace.ns.vocab.schema.geoDisjoint.property
lazy val geoEquals = lspace.ns.vocab.schema.geoEquals.property
lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects.property
lazy val geoOverlaps = lspace.ns.vocab.schema.geoOverlaps.property
lazy val geoTouches = lspace.ns.vocab.schema.geoTouches.property
lazy val geoWithin = lspace.ns.vocab.schema.geoWithin.property
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
lazy val hasMap = lspace.ns.vocab.schema.hasMap.property
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property
lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity.property
lazy val openingHoursSpecification = lspace.ns.vocab.schema.openingHoursSpecification.property
lazy val photo = lspace.ns.vocab.schema.photo.property
lazy val publicAccess = lspace.ns.vocab.schema.publicAccess.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val smokingAllowed = lspace.ns.vocab.schema.smokingAllowed.property
lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification.property
lazy val telephone = lspace.ns.vocab.schema.telephone.property
}
}