package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OpeningHoursSpecification extends OntologyDef(
        iri = "http://schema.org/OpeningHoursSpecification",
        iris = Set("http://schema.org/OpeningHoursSpecification"),
        label = "OpeningHoursSpecification",
        comment = """A structured value providing information about the opening hours of a place or a certain service inside a place.<br/><br/>

The place is <strong>open</strong> if the <a class="localLink" href="http://schema.org/opens">opens</a> property is specified, and <strong>closed</strong> otherwise.<br/><br/>

If the value for the <a class="localLink" href="http://schema.org/closes">closes</a> property is less than the value for the <a class="localLink" href="http://schema.org/opens">opens</a> property then the hour range is assumed to span over the next day.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}