package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object interactionType extends PropertyDef(
        iri = "http://schema.org/interactionType",
        iris = Set("http://schema.org/interactionType"),
        label = "interactionType",
        comment = """The Action representing the type of interaction. For up votes, +1s, etc. use <a class="localLink" href="http://schema.org/LikeAction">LikeAction</a>. For down votes use <a class="localLink" href="http://schema.org/DislikeAction">DislikeAction</a>. Otherwise, use the most specific Action.""",
        `@extends` = () => List(),
        `@range` = () => List(Action.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}