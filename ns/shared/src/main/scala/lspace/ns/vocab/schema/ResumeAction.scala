package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ResumeAction extends OntologyDef(
        iri = "http://schema.org/ResumeAction",
        iris = Set("http://schema.org/ResumeAction"),
        label = "ResumeAction",
        comment = """The act of resuming a device or application which was formerly paused (e.g. resume music playback or resume a timer).""",
        `@extends` = () => List(ControlAction.ontology)
       ){
}