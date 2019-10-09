package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ChooseAction extends OntologyDef(
        iri = "http://schema.org/ChooseAction",
        iris = Set("http://schema.org/ChooseAction"),
        label = "ChooseAction",
        comment = """The act of expressing a preference from a set of options or a large or unbounded set of choices/options.""",
        `@extends` = List(AssessAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AssessAction.Properties{
lazy val actionOption = lspace.ns.vocab.schema.actionOption.property
}
override lazy val properties: List[LProperty] = List(actionOption)
trait Properties extends lspace.ns.vocab.schema.AssessAction.Properties{
lazy val actionOption = lspace.ns.vocab.schema.actionOption.property
}
}