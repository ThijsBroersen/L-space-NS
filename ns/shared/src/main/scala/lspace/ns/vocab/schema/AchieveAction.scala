package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AchieveAction extends OntologyDef(
        iri = "http://schema.org/AchieveAction",
        iris = Set("http://schema.org/AchieveAction"),
        label = "AchieveAction",
        comment = """The act of accomplishing something via previous efforts. It is an instantaneous action rather than an ongoing process.""",
        `@extends` = () => List(Action.ontology)
       ){
}