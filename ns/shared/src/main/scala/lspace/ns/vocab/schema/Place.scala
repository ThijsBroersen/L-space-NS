package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object Place extends OntologyDef(
        iri = "https://schema.org/Place",
        iris = Set("https://schema.org/Place"),
        label = "Place",
        comment = """Entities that have a somewhat fixed, physical extension.""",
        `@extends` = () => List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val geoEquals = lspace.ns.vocab.schema.geoEquals
lazy val openingHoursSpecification = lspace.ns.vocab.schema.openingHoursSpecification
lazy val reviews = lspace.ns.vocab.schema.reviews
lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects
lazy val review = lspace.ns.vocab.schema.review
lazy val isicV4 = lspace.ns.vocab.schema.isicV4
lazy val geo = lspace.ns.vocab.schema.geo
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity
lazy val logo = lspace.ns.vocab.schema.logo
lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature
lazy val geoWithin = lspace.ns.vocab.schema.geoWithin
lazy val address = lspace.ns.vocab.schema.address
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty
lazy val events = lspace.ns.vocab.schema.events
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber
lazy val smokingAllowed = lspace.ns.vocab.schema.smokingAllowed
lazy val geoOverlaps = lspace.ns.vocab.schema.geoOverlaps
lazy val containedIn = lspace.ns.vocab.schema.containedIn
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val hasMap = lspace.ns.vocab.schema.hasMap
lazy val photos = lspace.ns.vocab.schema.photos
lazy val geoCovers = lspace.ns.vocab.schema.geoCovers
lazy val geoDisjoint = lspace.ns.vocab.schema.geoDisjoint
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree
lazy val publicAccess = lspace.ns.vocab.schema.publicAccess
lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification
lazy val geoContains = lspace.ns.vocab.schema.geoContains
lazy val containedInPlace = lspace.ns.vocab.schema.containedInPlace
lazy val maps = lspace.ns.vocab.schema.maps
lazy val map = lspace.ns.vocab.schema.map
lazy val containsPlace = lspace.ns.vocab.schema.containsPlace
lazy val geoTouches = lspace.ns.vocab.schema.geoTouches
lazy val photo = lspace.ns.vocab.schema.photo
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating
lazy val event = lspace.ns.vocab.schema.event
lazy val slogan = lspace.ns.vocab.schema.slogan
lazy val telephone = lspace.ns.vocab.schema.telephone
lazy val branchCode = lspace.ns.vocab.schema.branchCode
lazy val geoCoveredBy = lspace.ns.vocab.schema.geoCoveredBy
lazy val geoCrosses = lspace.ns.vocab.schema.geoCrosses}
override lazy val properties: List[Property] = List(geoEquals, openingHoursSpecification, reviews, geoIntersects, review, isicV4, geo, maximumAttendeeCapacity, logo, amenityFeature, geoWithin, address, additionalProperty, events, globalLocationNumber, smokingAllowed, geoOverlaps, containedIn, faxNumber, hasMap, photos, geoCovers, geoDisjoint, isAccessibleForFree, publicAccess, specialOpeningHoursSpecification, geoContains, containedInPlace, maps, map, containsPlace, geoTouches, photo, aggregateRating, event, slogan, telephone, branchCode, geoCoveredBy, geoCrosses)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val geoEquals = lspace.ns.vocab.schema.geoEquals
lazy val openingHoursSpecification = lspace.ns.vocab.schema.openingHoursSpecification
lazy val reviews = lspace.ns.vocab.schema.reviews
lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects
lazy val review = lspace.ns.vocab.schema.review
lazy val isicV4 = lspace.ns.vocab.schema.isicV4
lazy val geo = lspace.ns.vocab.schema.geo
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity
lazy val logo = lspace.ns.vocab.schema.logo
lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature
lazy val geoWithin = lspace.ns.vocab.schema.geoWithin
lazy val address = lspace.ns.vocab.schema.address
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty
lazy val events = lspace.ns.vocab.schema.events
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber
lazy val smokingAllowed = lspace.ns.vocab.schema.smokingAllowed
lazy val geoOverlaps = lspace.ns.vocab.schema.geoOverlaps
lazy val containedIn = lspace.ns.vocab.schema.containedIn
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val hasMap = lspace.ns.vocab.schema.hasMap
lazy val photos = lspace.ns.vocab.schema.photos
lazy val geoCovers = lspace.ns.vocab.schema.geoCovers
lazy val geoDisjoint = lspace.ns.vocab.schema.geoDisjoint
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree
lazy val publicAccess = lspace.ns.vocab.schema.publicAccess
lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification
lazy val geoContains = lspace.ns.vocab.schema.geoContains
lazy val containedInPlace = lspace.ns.vocab.schema.containedInPlace
lazy val maps = lspace.ns.vocab.schema.maps
lazy val map = lspace.ns.vocab.schema.map
lazy val containsPlace = lspace.ns.vocab.schema.containsPlace
lazy val geoTouches = lspace.ns.vocab.schema.geoTouches
lazy val photo = lspace.ns.vocab.schema.photo
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating
lazy val event = lspace.ns.vocab.schema.event
lazy val slogan = lspace.ns.vocab.schema.slogan
lazy val telephone = lspace.ns.vocab.schema.telephone
lazy val branchCode = lspace.ns.vocab.schema.branchCode
lazy val geoCoveredBy = lspace.ns.vocab.schema.geoCoveredBy
lazy val geoCrosses = lspace.ns.vocab.schema.geoCrosses}
}