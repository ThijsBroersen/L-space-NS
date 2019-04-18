package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object spatial extends PropertyDef(
        iri = "http://schema.org/spatial",
        iris = Set("http://schema.org/spatial"),
        label = "spatial",
        comment = """The "spatial" property can be used in cases when more specific properties
(e.g. <a class="localLink" href="http://schema.org/locationCreated">locationCreated</a>, <a class="localLink" href="http://schema.org/spatialCoverage">spatialCoverage</a>, <a class="localLink" href="http://schema.org/contentLocation">contentLocation</a>) are not known to be appropriate.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}