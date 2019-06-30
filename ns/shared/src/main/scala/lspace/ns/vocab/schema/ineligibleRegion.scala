package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ineligibleRegion extends PropertyDef(
        iri = "http://schema.org/ineligibleRegion",
        iris = Set("http://schema.org/ineligibleRegion"),
        label = "ineligibleRegion",
        comment = """The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>

See also <a class="localLink" href="http://schema.org/eligibleRegion">eligibleRegion</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, GeoShape.ontology, Place.ontology)
       ){
}