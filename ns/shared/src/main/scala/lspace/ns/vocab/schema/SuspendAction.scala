package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SuspendAction extends OntologyDef(
        iri = "http://schema.org/SuspendAction",
        iris = Set("http://schema.org/SuspendAction"),
        label = "SuspendAction",
        comment = """The act of momentarily pausing a device or application (e.g. pause music playback or pause a timer).""",
        `@extends` = List(ControlAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.ControlAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.ControlAction.Properties{

}
}