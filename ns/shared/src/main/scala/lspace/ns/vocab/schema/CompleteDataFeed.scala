package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CompleteDataFeed extends OntologyDef(
        iri = "http://schema.org/CompleteDataFeed",
        iris = Set("http://schema.org/CompleteDataFeed"),
        label = "CompleteDataFeed",
        comment = """A <a class="localLink" href="http://schema.org/CompleteDataFeed">CompleteDataFeed</a> is a <a class="localLink" href="http://schema.org/DataFeed">DataFeed</a> whose standard representation includes content for every item currently in the feed.<br/><br/>

This is the equivalent of Atom's element as defined in Feed Paging and Archiving <a href="https://tools.ietf.org/html/rfc5005">RFC 5005</a>, For example (and as defined for Atom), when using data from a feed that represents a collection of items that varies over time (e.g. "Top Twenty Records") there is no need to have newer entries mixed in alongside older, obsolete entries. By marking this feed as a CompleteDataFeed, old entries can be safely discarded when the feed is refreshed, since we can assume the feed has provided descriptions for all current items.""",
        `@extends` = () => List(DataFeed.ontology)
       ){
object keys extends lspace.ns.vocab.schema.DataFeed.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.DataFeed.Properties{

}
}