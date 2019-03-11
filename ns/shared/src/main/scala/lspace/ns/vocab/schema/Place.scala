package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object Place extends OntologyDef(
        iri = "https://schema.org/Place",
        iris = Set("https://schema.org/Place"),
        label = "Place",
        comment = """Entities that have a somewhat fixed, physical extension.""",
        `@extends` = () => List(Thing)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val openingHoursSpecification = lspace.ns.vocab.schema.openingHoursSpecification
lazy val reviews = lspace.ns.vocab.schema.reviews
lazy val review = lspace.ns.vocab.schema.review
lazy val isicV4 = lspace.ns.vocab.schema.isicV4
lazy val geo = lspace.ns.vocab.schema.geo
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity
lazy val logo = lspace.ns.vocab.schema.logo
lazy val geospatiallyCoveredBy = lspace.ns.vocab.schema.geospatiallyCoveredBy
lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature
lazy val address = lspace.ns.vocab.schema.address
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty
lazy val events = lspace.ns.vocab.schema.events
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber
lazy val smokingAllowed = lspace.ns.vocab.schema.smokingAllowed
lazy val geospatiallyTouches = lspace.ns.vocab.schema.geospatiallyTouches
lazy val containedIn = lspace.ns.vocab.schema.containedIn
lazy val geospatiallyDisjoint = lspace.ns.vocab.schema.geospatiallyDisjoint
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val hasMap = lspace.ns.vocab.schema.hasMap
lazy val photos = lspace.ns.vocab.schema.photos
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree
lazy val publicAccess = lspace.ns.vocab.schema.publicAccess
lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification
lazy val geospatiallyCovers = lspace.ns.vocab.schema.geospatiallyCovers
lazy val containedInPlace = lspace.ns.vocab.schema.containedInPlace
lazy val geospatiallyIntersects = lspace.ns.vocab.schema.geospatiallyIntersects
lazy val maps = lspace.ns.vocab.schema.maps
lazy val geospatiallyWithin = lspace.ns.vocab.schema.geospatiallyWithin
lazy val map = lspace.ns.vocab.schema.map
lazy val containsPlace = lspace.ns.vocab.schema.containsPlace
lazy val photo = lspace.ns.vocab.schema.photo
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating
lazy val event = lspace.ns.vocab.schema.event
lazy val geospatiallyEquals = lspace.ns.vocab.schema.geospatiallyEquals
lazy val geospatiallyOverlaps = lspace.ns.vocab.schema.geospatiallyOverlaps
lazy val telephone = lspace.ns.vocab.schema.telephone
lazy val branchCode = lspace.ns.vocab.schema.branchCode
lazy val geospatiallyContains = lspace.ns.vocab.schema.geospatiallyContains
lazy val geospatiallyCrosses = lspace.ns.vocab.schema.geospatiallyCrosses}
override lazy val properties: List[Property] = List(openingHoursSpecification, reviews, review, isicV4, geo, maximumAttendeeCapacity, logo, geospatiallyCoveredBy, amenityFeature, address, additionalProperty, events, globalLocationNumber, smokingAllowed, geospatiallyTouches, containedIn, geospatiallyDisjoint, faxNumber, hasMap, photos, isAccessibleForFree, publicAccess, specialOpeningHoursSpecification, geospatiallyCovers, containedInPlace, geospatiallyIntersects, maps, geospatiallyWithin, map, containsPlace, photo, aggregateRating, event, geospatiallyEquals, geospatiallyOverlaps, telephone, branchCode, geospatiallyContains, geospatiallyCrosses)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val openingHoursSpecification = lspace.ns.vocab.schema.openingHoursSpecification
lazy val reviews = lspace.ns.vocab.schema.reviews
lazy val review = lspace.ns.vocab.schema.review
lazy val isicV4 = lspace.ns.vocab.schema.isicV4
lazy val geo = lspace.ns.vocab.schema.geo
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity
lazy val logo = lspace.ns.vocab.schema.logo
lazy val geospatiallyCoveredBy = lspace.ns.vocab.schema.geospatiallyCoveredBy
lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature
lazy val address = lspace.ns.vocab.schema.address
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty
lazy val events = lspace.ns.vocab.schema.events
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber
lazy val smokingAllowed = lspace.ns.vocab.schema.smokingAllowed
lazy val geospatiallyTouches = lspace.ns.vocab.schema.geospatiallyTouches
lazy val containedIn = lspace.ns.vocab.schema.containedIn
lazy val geospatiallyDisjoint = lspace.ns.vocab.schema.geospatiallyDisjoint
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val hasMap = lspace.ns.vocab.schema.hasMap
lazy val photos = lspace.ns.vocab.schema.photos
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree
lazy val publicAccess = lspace.ns.vocab.schema.publicAccess
lazy val specialOpeningHoursSpecification = lspace.ns.vocab.schema.specialOpeningHoursSpecification
lazy val geospatiallyCovers = lspace.ns.vocab.schema.geospatiallyCovers
lazy val containedInPlace = lspace.ns.vocab.schema.containedInPlace
lazy val geospatiallyIntersects = lspace.ns.vocab.schema.geospatiallyIntersects
lazy val maps = lspace.ns.vocab.schema.maps
lazy val geospatiallyWithin = lspace.ns.vocab.schema.geospatiallyWithin
lazy val map = lspace.ns.vocab.schema.map
lazy val containsPlace = lspace.ns.vocab.schema.containsPlace
lazy val photo = lspace.ns.vocab.schema.photo
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating
lazy val event = lspace.ns.vocab.schema.event
lazy val geospatiallyEquals = lspace.ns.vocab.schema.geospatiallyEquals
lazy val geospatiallyOverlaps = lspace.ns.vocab.schema.geospatiallyOverlaps
lazy val telephone = lspace.ns.vocab.schema.telephone
lazy val branchCode = lspace.ns.vocab.schema.branchCode
lazy val geospatiallyContains = lspace.ns.vocab.schema.geospatiallyContains
lazy val geospatiallyCrosses = lspace.ns.vocab.schema.geospatiallyCrosses}
}