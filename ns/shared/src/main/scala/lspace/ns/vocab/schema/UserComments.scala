package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object UserComments extends OntologyDef(
        iri = "http://schema.org/UserComments",
        iris = Set("http://schema.org/UserComments"),
        label = "UserComments",
        comment = """UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use <a class="localLink" href="http://schema.org/Action">Action</a>-based vocabulary, alongside types such as <a class="localLink" href="http://schema.org/Comment">Comment</a>.""",
        `@extends` = () => List(UserInteraction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.UserInteraction.Properties{
lazy val replyToUrl = lspace.ns.vocab.schema.replyToUrl.property
lazy val commentTime = lspace.ns.vocab.schema.commentTime.property
lazy val creator = lspace.ns.vocab.schema.creator.property
}
override lazy val properties: List[LProperty] = List(replyToUrl, commentTime, creator)
trait Properties extends lspace.ns.vocab.schema.UserInteraction.Properties{
lazy val replyToUrl = lspace.ns.vocab.schema.replyToUrl.property
lazy val commentTime = lspace.ns.vocab.schema.commentTime.property
lazy val creator = lspace.ns.vocab.schema.creator.property
}
}