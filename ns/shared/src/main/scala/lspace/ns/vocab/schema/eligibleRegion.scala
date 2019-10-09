package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object eligibleRegion extends PropertyDef(
        iri = "http://schema.org/eligibleRegion",
        iris = Set("http://schema.org/eligibleRegion"),
        label = "eligibleRegion",
        comment = """The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>

See also <a class="localLink" href="http://schema.org/ineligibleRegion">ineligibleRegion</a>.""",
        `@extends` = List(areaServed.property),
        `@range` = List(`@string`, GeoShape.ontology, Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.areaServed.Properties
}