package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object knowsAbout extends PropertyDef(
        iri = "http://schema.org/knowsAbout",
        iris = Set("http://schema.org/knowsAbout"),
        label = "knowsAbout",
        comment = """Of a <a class="localLink" href="http://schema.org/Person">Person</a>, and less typically of an <a class="localLink" href="http://schema.org/Organization">Organization</a>, to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or yet relate this to educational content, events, objectives or <a class="localLink" href="http://schema.org/JobPosting">JobPosting</a> descriptions.""",
        `@extends` = List(),
        `@range` = List(`@string`, Thing.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}