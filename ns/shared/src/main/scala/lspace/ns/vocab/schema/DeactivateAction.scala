package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DeactivateAction extends OntologyDef(
        iri = "http://schema.org/DeactivateAction",
        iris = Set("http://schema.org/DeactivateAction"),
        label = "DeactivateAction",
        comment = """The act of stopping or deactivating a device or application (e.g. stopping a timer or turning off a flashlight).""",
        `@extends` = () => List(ControlAction.ontology)
       ){
}