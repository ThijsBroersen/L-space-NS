package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Action extends OntologyDef(
        iri = "http://schema.org/Action",
        iris = Set("http://schema.org/Action"),
        label = "Action",
        comment = """An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.<br/><br/>

See also <a href="http://blog.schema.org/2014/04/announcing-schemaorg-actions.html">blog post</a> and <a href="http://schema.org/docs/actions.html">Actions overview document</a>.""",
        `@extends` = () => List(Thing.ontology)
       ){
}