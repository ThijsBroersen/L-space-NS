package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object specialOpeningHoursSpecification extends PropertyDef(
        iri = "https://schema.org/specialOpeningHoursSpecification",
        iris = Set("https://schema.org/specialOpeningHoursSpecification"),
        label = "specialOpeningHoursSpecification",
        comment = """The special opening hours of a certain place.<br/><br/>

Use this to explicitly override general opening hours brought in scope by <a class="localLink" href="http://schema.org/openingHoursSpecification">openingHoursSpecification</a> or <a class="localLink" href="http://schema.org/openingHours">openingHours</a>.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}