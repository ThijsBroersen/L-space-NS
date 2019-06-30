package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object UserBlocks extends OntologyDef(
        iri = "http://schema.org/UserBlocks",
        iris = Set("http://schema.org/UserBlocks"),
        label = "UserBlocks",
        comment = """UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use <a class="localLink" href="http://schema.org/Action">Action</a>-based vocabulary, alongside types such as <a class="localLink" href="http://schema.org/Comment">Comment</a>.""",
        `@extends` = () => List(UserInteraction.ontology)
       ){
}