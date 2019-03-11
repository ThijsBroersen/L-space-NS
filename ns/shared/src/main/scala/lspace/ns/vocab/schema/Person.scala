package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object Person extends OntologyDef(
        iri = "https://schema.org/Person",
        iris = Set("https://schema.org/Person"),
        label = "Person",
        comment = """A person (alive, dead, undead, or fictional).""",
        `@extends` = () => List(Thing)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val honorificSuffix = lspace.ns.vocab.schema.honorificSuffix
lazy val publishingPrinciples = lspace.ns.vocab.schema.publishingPrinciples
lazy val seeks = lspace.ns.vocab.schema.seeks
lazy val email = lspace.ns.vocab.schema.email
lazy val weight = lspace.ns.vocab.schema.weight
lazy val memberOf = lspace.ns.vocab.schema.memberOf
lazy val isicV4 = lspace.ns.vocab.schema.isicV4
lazy val colleague = lspace.ns.vocab.schema.colleague
lazy val follows = lspace.ns.vocab.schema.follows
lazy val birthDate = lspace.ns.vocab.schema.birthDate
lazy val parent = lspace.ns.vocab.schema.parent
lazy val address = lspace.ns.vocab.schema.address
lazy val gender = lspace.ns.vocab.schema.gender
lazy val vatID = lspace.ns.vocab.schema.vatID
lazy val parents = lspace.ns.vocab.schema.parents
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber
lazy val worksFor = lspace.ns.vocab.schema.worksFor
lazy val familyName = lspace.ns.vocab.schema.familyName
lazy val brand = lspace.ns.vocab.schema.brand
lazy val contactPoints = lspace.ns.vocab.schema.contactPoints
lazy val honorificPrefix = lspace.ns.vocab.schema.honorificPrefix
lazy val additionalName = lspace.ns.vocab.schema.additionalName
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val duns = lspace.ns.vocab.schema.duns
lazy val contactPoint = lspace.ns.vocab.schema.contactPoint
lazy val deathDate = lspace.ns.vocab.schema.deathDate
lazy val funder = lspace.ns.vocab.schema.funder
lazy val knowsLanguage = lspace.ns.vocab.schema.knowsLanguage
lazy val sibling = lspace.ns.vocab.schema.sibling
lazy val children = lspace.ns.vocab.schema.children
lazy val affiliation = lspace.ns.vocab.schema.affiliation
lazy val knows = lspace.ns.vocab.schema.knows
lazy val birthPlace = lspace.ns.vocab.schema.birthPlace
lazy val naics = lspace.ns.vocab.schema.naics
lazy val spouse = lspace.ns.vocab.schema.spouse
lazy val deathPlace = lspace.ns.vocab.schema.deathPlace
lazy val nationality = lspace.ns.vocab.schema.nationality
lazy val awards = lspace.ns.vocab.schema.awards
lazy val netWorth = lspace.ns.vocab.schema.netWorth
lazy val hasOfferCatalog = lspace.ns.vocab.schema.hasOfferCatalog
lazy val performerIn = lspace.ns.vocab.schema.performerIn
lazy val homeLocation = lspace.ns.vocab.schema.homeLocation
lazy val siblings = lspace.ns.vocab.schema.siblings
lazy val height = lspace.ns.vocab.schema.height
lazy val makesOffer = lspace.ns.vocab.schema.makesOffer
lazy val relatedTo = lspace.ns.vocab.schema.relatedTo
lazy val givenName = lspace.ns.vocab.schema.givenName
lazy val jobTitle = lspace.ns.vocab.schema.jobTitle
lazy val alumniOf = lspace.ns.vocab.schema.alumniOf
lazy val taxID = lspace.ns.vocab.schema.taxID
lazy val hasPOS = lspace.ns.vocab.schema.hasPOS
lazy val telephone = lspace.ns.vocab.schema.telephone
lazy val hasOccupation = lspace.ns.vocab.schema.hasOccupation
lazy val sponsor = lspace.ns.vocab.schema.sponsor
lazy val award = lspace.ns.vocab.schema.award
lazy val workLocation = lspace.ns.vocab.schema.workLocation
lazy val owns = lspace.ns.vocab.schema.owns
lazy val colleagues = lspace.ns.vocab.schema.colleagues
lazy val knowsAbout = lspace.ns.vocab.schema.knowsAbout}
override lazy val properties: List[Property] = List(honorificSuffix, publishingPrinciples, seeks, email, weight, memberOf, isicV4, colleague, follows, birthDate, parent, address, gender, vatID, parents, globalLocationNumber, worksFor, familyName, brand, contactPoints, honorificPrefix, additionalName, faxNumber, duns, contactPoint, deathDate, funder, knowsLanguage, sibling, children, affiliation, knows, birthPlace, naics, spouse, deathPlace, nationality, awards, netWorth, hasOfferCatalog, performerIn, homeLocation, siblings, height, makesOffer, relatedTo, givenName, jobTitle, alumniOf, taxID, hasPOS, telephone, hasOccupation, sponsor, award, workLocation, owns, colleagues, knowsAbout)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties
}