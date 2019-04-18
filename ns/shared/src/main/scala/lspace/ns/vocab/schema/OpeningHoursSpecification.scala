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
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val dayOfWeek = lspace.ns.vocab.schema.dayOfWeek.property
lazy val closes = lspace.ns.vocab.schema.closes.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val opens = lspace.ns.vocab.schema.opens.property
}
override lazy val properties: List[LProperty] = List(dayOfWeek, closes, validThrough, validFrom, opens)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val dayOfWeek = lspace.ns.vocab.schema.dayOfWeek.property
lazy val closes = lspace.ns.vocab.schema.closes.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val opens = lspace.ns.vocab.schema.opens.property
}
}