class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        for (int i = 0; i < skill_trees.length; i++) {
            String skillTree = skill_trees[i];

            int prevSkillIndex = skillTree.indexOf(skill.charAt(0));
            for (int j = 1; j < skill.length(); j++) {
                int index = skillTree.indexOf(skill.charAt(j));
                if( prevSkillIndex == -1 && index > -1 ){
                    answer--;
                    break;
                }

                if( index < prevSkillIndex && index > -1 ){
                    answer--;
                    break;
                }
                prevSkillIndex = index;
            }
        }
        
        return answer;
    }
}