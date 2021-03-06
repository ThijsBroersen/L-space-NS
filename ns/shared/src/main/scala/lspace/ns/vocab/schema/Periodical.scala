package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Periodical extends OntologyDef(
        iri = "http://schema.org/Periodical",
        iris = Set("http://schema.org/Periodical"),
        label = "Periodical",
        comment = """A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.<br/><br/>

See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.""",
        `@extends` = List(CreativeWorkSeries.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{

}
}