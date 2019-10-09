package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Quotation extends OntologyDef(
        iri = "http://schema.org/Quotation",
        iris = Set("http://schema.org/Quotation"),
        label = "Quotation",
        comment = """A quotation. Often but not necessarily from some written work, attributable to a real world author and - if associated with a fictional character - to any fictional Person. Use <a class="localLink" href="http://schema.org/isBasedOn">isBasedOn</a> to link to source/origin. The <a class="localLink" href="http://schema.org/recordedIn">recordedIn</a> property can be used to reference a Quotation from an <a class="localLink" href="http://schema.org/Event">Event</a>.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val spokenByCharacter = lspace.ns.vocab.schema.spokenByCharacter.property
}
override lazy val properties: List[LProperty] = List(spokenByCharacter)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val spokenByCharacter = lspace.ns.vocab.schema.spokenByCharacter.property
}
}