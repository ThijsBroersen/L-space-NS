package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object backstory extends PropertyDef(
        iri = "http://schema.org/backstory",
        iris = Set("http://schema.org/backstory"),
        label = "backstory",
        comment = """For an <a class="localLink" href="http://schema.org/Article">Article</a>, typically a <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>, the backstory property provides a textual summary giving a brief explanation of why and how an article was created. In a journalistic setting this could include information about reporting process, methods, interviews, data sources, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}