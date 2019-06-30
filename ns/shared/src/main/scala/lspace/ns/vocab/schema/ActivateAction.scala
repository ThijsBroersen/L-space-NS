package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ActivateAction extends OntologyDef(
        iri = "http://schema.org/ActivateAction",
        iris = Set("http://schema.org/ActivateAction"),
        label = "ActivateAction",
        comment = """The act of starting or activating a device or application (e.g. starting a timer or turning on a flashlight).""",
        `@extends` = () => List(ControlAction.ontology)
       ){
}