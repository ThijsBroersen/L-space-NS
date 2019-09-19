package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReplaceAction extends OntologyDef(
        iri = "http://schema.org/ReplaceAction",
        iris = Set("http://schema.org/ReplaceAction"),
        label = "ReplaceAction",
        comment = """The act of editing a recipient by replacing an old object with a new object.""",
        `@extends` = () => List(UpdateAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.UpdateAction.Properties{
lazy val replacee = lspace.ns.vocab.schema.replacee.property
lazy val replacer = lspace.ns.vocab.schema.replacer.property
}
override lazy val properties: List[LProperty] = List(replacee, replacer)
trait Properties extends lspace.ns.vocab.schema.UpdateAction.Properties{
lazy val replacee = lspace.ns.vocab.schema.replacee.property
lazy val replacer = lspace.ns.vocab.schema.replacer.property
}
}