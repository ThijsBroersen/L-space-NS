package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BefriendAction extends OntologyDef(
        iri = "http://schema.org/BefriendAction",
        iris = Set("http://schema.org/BefriendAction"),
        label = "BefriendAction",
        comment = """The act of forming a personal connection with someone (object) mutually/bidirectionally/symmetrically.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, BefriendAction implies that the connection is reciprocal.</li>
</ul>
""",
        `@extends` = () => List(InteractAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.InteractAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.InteractAction.Properties{

}
}